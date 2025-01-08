#include<bits/stdc++.h>
using namespace std;

class ImathOperation{
    public:
        virtual void operate(int x,int y)=0;
        virtual ~ImathOperation(){
            cout<<"Deleted"<<endl;
        };
};

class AddStratery:public ImathOperation{
    public:
        virtual void operate(int x,int y) override {
            cout<<x+y<<endl;
        }
};

class SubtractStratery:public ImathOperation{
    public:
        virtual void operate(int x,int y) override {
            cout<<x-y<<endl;
        }
};

class MultiplyStratery:public ImathOperation{
    public:
        virtual void operate(int x,int y) override {
            cout<<x*y<<endl;
        }
};

class DivideStratery:public ImathOperation{
    public:
        virtual void operate(int x,int y) override {
            cout<<x/y<<endl;
        }
};

class MathContext{
    private:
        ImathOperation*obj;
    public:
        MathContext(ImathOperation*obj){
            this->obj=obj;
        }
        ~MathContext() {
            delete obj;
        }
        void setStrategy(ImathOperation*obj){
            delete this->obj;
            this->obj=obj;
        }
        void operate(int x,int y){
            obj->operate(x,y);
            
        }  

};

int main() {
    MathContext *op = new MathContext(new MultiplyStratery());
    op->operate(1, 10);
    op->setStrategy(new AddStratery());
    op->operate(1,10);
    op->setStrategy(new DivideStratery());
    op->operate(80,8);
    delete op;
    return 0;
}
package lab;

interface Work{
    void Work();
}

interface Eat{
    void Eat();
}

interface Sleep{
    void Sleep();
}
class HumanWorker implements Work, Eat, Sleep {
    public void Work(){
        // Логика работы
    }

    public void Eat(){
        // Логика питания
    }

    public void Sleep() {
        // Логика сна
    }
}
class RobotWorker implements Work {
    public void Work(){
        // Логика работы
    }

}


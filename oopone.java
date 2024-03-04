// Task 1: Code a Person class
class Person {
    constructor() {
        this.name = 'Tom';
        this.age = 20;
        this.energy = 100;
    }

    sleep() {
        this.energy += 10;
    }
    doSomethingFun() {
        this.energy -= 10;
    }
}

// Task 2: Code a Worker class
class Worker extends Person {
    constructor() {
        super();
        this.xp = 0;
        this.hourlyWage = 10;
    }
        goToWork() {
        this.xp += 10; 
    }
}
// Task 3: Code an intern object, run methods
function intern() {
    const internObj = new Worker();
    internObj.name = 'Bob';
    internObj.age = 21;
    internObj.energy = 110;
    internObj.xp = 0;
    internObj.hourlyWage = 10;
    internObj.goToWork();
    return internObj;
}

// Task 4: Code a manager object, methods
function manager() {
    const managerObj = new Worker();
    managerObj.name = 'Alice';
    managerObj.age = 30;
    managerObj.energy = 120;
    managerObj.xp = 100;
    managerObj.hourlyWage = 30;
    managerObj.doSomethingFun();
    return managerObj; 
}
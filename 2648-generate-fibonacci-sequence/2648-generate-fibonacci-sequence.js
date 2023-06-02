/**
 * @return {Generator<number>}
 */
var fibGenerator = function*() {
    let a=0;
    let b=1;
    // yield the first two numbers separately
    yield a;
    yield b;

    // continue to yield subsequent numbers of the sequence
    while(true){
        let c= a+b;
        yield c;
        a=b;
        b=c;
    }
};

/**
 * const gen = fibGenerator();
 * gen.next().value; // 0
 * gen.next().value; // 1
 */
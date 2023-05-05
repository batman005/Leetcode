/**
 * @return {Function}
 */
function createHelloWorld(...args){
    return () => "Hello World";
}

const hello = createHelloWorld();
console.log(hello());
/**
 * const f = createHelloWorld();
 * f(); // "Hello World"
 */
/**
 * @return {Function}
 */
function createHelloWorld(...args){
    return () => "Hello World";
}

/**
 * const f = createHelloWorld();
 * f(); // "Hello World"
 */
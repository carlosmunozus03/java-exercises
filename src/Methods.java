public class Methods {
    // 1.- Definir metodos
    // 2.- Llamar metodo
    // 3.- Sobrecargar metodo
    // 4.- Pasar de parametros a metodos
    // 5.-Recursividad

    // version 1
    public static void sayHello(int times) {
        for (int i = 0; i < times; i += 1) {
            sayHello();
        }
    }

    // version 2
    public static void sayHello() {
        sayHello("Hello", "World");
    }

    // version 3
    public static void sayHello(String name) {
        sayHello("Hello", name);
    }

    // version 4
    public static void sayHello(String greeting, String name) {
        System.out.println(greeting + ", " + name + "!");
    }

    // Aqui para llamar al metodo
    public static void main(String[] args) {
        sayHello();
    }
}

// Public modifica la visibilidad (otras clases pueden verlo o no)
// Static el metodo pertenece a la clase, a diferencia de sus instancias
/* String es el tipo del metodo (Se debe especificar el tipo de 'valor' que desea retornar) - Si no quiiere retornar
nada, usar'VOID'.
*/
// sayHello el nombre del metodo
// (String name) es el parametro que acepta
// se puede definir un parametro, multiples separados por comas y especificar su tipo o ningun parametro.

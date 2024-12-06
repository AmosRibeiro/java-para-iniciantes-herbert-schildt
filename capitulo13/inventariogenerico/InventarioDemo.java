package capitulo13.inventariogenerico;

public class InventarioDemo {
    public static void main(String[] args) {

        Inventario<Object> inv = new Inventario<>();

        inv.adicionarItem(new Espada("Espada Lendária", 999));
        inv.adicionarItem(new Armadura("Black Armor", "Rare", 99));
        inv.adicionarItem(new Rei(true));

        inv.mostrarItem();
    }
}

package structural.facade;

class HardDrive {
    public byte[] read(long lba, int size) {
        System.out.println("read lba = " + lba + ", size = " + size);
        return new byte[size];
    }
}

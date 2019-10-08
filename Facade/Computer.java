package Facade;

class Computer {
	  private CPU cpu;
	  private Memory memory;
	  private HardDrive hardDrive;

	  public Computer() {
	    this.cpu = new CPU();
	    this.memory = new Memory();
	    this.hardDrive = new HardDrive();
	  }

	  public void startComputer() {
	    cpu.freeze();
	    long BOOT_ADDRESS = 0;
		long BOOT_SECTOR = 0;
		int SECTOR_SIZE = 0;
		memory.load(BOOT_ADDRESS, hardDrive.read(BOOT_SECTOR, SECTOR_SIZE));
	    cpu.jump(BOOT_ADDRESS);
	    cpu.execute();
	  }
	}


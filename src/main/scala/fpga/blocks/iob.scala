import fpga.BlockEnum._

package fpga.blocks{
  class IOB(locationXY: (Int,Int), pbEnum : BlockEnum) extends AnyBlock{
    val location = locationXY
    var name = "Unknown IOB"
    val blockEnumeration = pbEnum
    var padEnable   = false
    var inputToFPGA = false
    def configure(netlistNode: scala.xml.Node){
    }
  }
}

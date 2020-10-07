import kotlin.random.Random

/*
This problem was asked by Amazon.
You are given a list of data entries that represent entries and exits of groups of people into a building. An entry looks like this:
{"timestamp": 1526579928, count: 3, "type": "enter"}
This means 3 people entered the building. An exit looks like this:
{"timestamp": 1526580382, count: 2, "type": "exit"}
This means that 2 people exited the building. timestamp is in Unix time.
Find the busiest period in the building, that is, the time with the most people in the building. Return it as a pair of (start, end) timestamps. You can assume the building always starts off and ends up empty, i.e. with 0 people inside.
*/

class A171 {


    fun getBusiestTimeStamp(dataEntries: List<DataEntry171>) : Long {

        // this variable stores the current number of people in the building at every point in time
        // Since it's guaranteed to be 0 at that start of the day, we initialize it as 0
        var currentNumberInBuilding = 0

        // this variable stores the busiest timestamp so far
        // Since the first action is always going to be an entry, we initialize this with the first timestamp from the data entries
        var busiestTime = dataEntries.first().timestamp

        // this variable stores the total number of people in the building at the busiest timestamp
        // Since the first action is always going to be an entry, we initialize this with the first set of people to enter the building
        var highestNumber = dataEntries.first().count


        // loop through all the timestamps
        for(i in dataEntries) {

            // update the current number of people in the building
            if(i.type == "enter") { currentNumberInBuilding += i.count } else { currentNumberInBuilding -= i.count }

            // check if the building is busier that the highest recorded current-population and update suit
            if(currentNumberInBuilding >= highestNumber) { highestNumber = currentNumberInBuilding; busiestTime = i.timestamp }
        }

        return busiestTime
    }


    data class DataEntry171(
            val timestamp: Long,
            val count: Int,
            val type: String
    )

}

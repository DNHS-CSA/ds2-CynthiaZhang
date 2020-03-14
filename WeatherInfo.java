public class WeatherInfo
{
    private String city;
    private int day;
    private String weather;
    public WeatherInfo(String c, int d, String w)
    {
        city = c;
        day = d;
        weather = w;
    } 
    public String changeWeather(String w)
    {
        String prev = weather;
        weather = w;
        return prev;
    }
    public String getWeather()
    {
        return weather;
    }   
}
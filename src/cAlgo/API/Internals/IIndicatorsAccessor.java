package cAlgo.API.Internals;

import Common.Activation;
import static Common.JavonetHelper.Convert;
import static Common.JavonetHelper.getGetObjectName;
import static Common.JavonetHelper.getReturnObjectName;
import static Common.JavonetHelper.ConvertToConcreteInterfaceImplementation;
import Common.JavonetHelper;
import Common.MethodTypeAnnotation;
import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.JavonetFramework;
import com.javonet.api.NObject;
import com.javonet.api.NEnum;
import com.javonet.api.keywords.NRef;
import com.javonet.api.keywords.NOut;
import com.javonet.api.NControlContainer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import java.lang.*;
import cAlgo.API.Internals.*;
import jio.System.*;
import cAlgo.API.*;
import cAlgo.API.Indicators.*;

public interface IIndicatorsAccessor {
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public <TIndicator> TIndicator GetIndicator(Object[] parameterValues, Class<?> returnType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public <TIndicator> TIndicator GetIndicator(
      MarketSeries marketSeries, Object[] parameterValues, Class<?> returnType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public MovingAverage MovingAverage(
      DataSeries source, java.lang.Integer periods, MovingAverageType maType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public ExponentialMovingAverage ExponentialMovingAverage(
      DataSeries source, java.lang.Integer periods);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public WeightedMovingAverage WeightedMovingAverage(DataSeries source, java.lang.Integer periods);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public SimpleMovingAverage SimpleMovingAverage(DataSeries source, java.lang.Integer periods);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public TriangularMovingAverage TriangularMovingAverage(
      DataSeries source, java.lang.Integer periods);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public HighMinusLow HighMinusLow();
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public HighMinusLow HighMinusLow(MarketSeries marketSeries);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public TrueRange TrueRange();
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public TrueRange TrueRange(MarketSeries marketSeries);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public WellesWilderSmoothing WellesWilderSmoothing(DataSeries source, java.lang.Integer periods);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public SwingIndex SwingIndex(java.lang.Integer limitMoveValue);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public SwingIndex SwingIndex(MarketSeries marketSeries, java.lang.Integer limitMoveValue);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public AccumulativeSwingIndex AccumulativeSwingIndex(java.lang.Integer limitMoveValue);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public AccumulativeSwingIndex AccumulativeSwingIndex(
      MarketSeries marketSeries, java.lang.Integer limitMoveValue);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public Aroon Aroon(java.lang.Integer periods);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public Aroon Aroon(MarketSeries marketSeries, java.lang.Integer periods);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public StandardDeviation StandardDeviation(
      DataSeries source, java.lang.Integer periods, MovingAverageType maType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public BollingerBands BollingerBands(
      DataSeries source,
      java.lang.Integer periods,
      java.lang.Double standardDeviations,
      MovingAverageType maType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public RelativeStrengthIndex RelativeStrengthIndex(DataSeries source, java.lang.Integer periods);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public TimeSeriesMovingAverage TimeSeriesMovingAverage(
      DataSeries source, java.lang.Integer periods);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public LinearRegressionForecast LinearRegressionForecast(
      DataSeries source, java.lang.Integer periods);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public LinearRegressionRSquared LinearRegressionRSquared(
      DataSeries source, java.lang.Integer periods);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public PriceROC PriceROC(DataSeries source, java.lang.Integer periods);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public Vidya Vidya(DataSeries source, java.lang.Integer periods, java.lang.Double r2Scale);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public UltimateOscillator UltimateOscillator(
      java.lang.Integer cycle1, java.lang.Integer cycle2, java.lang.Integer cycle3);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public UltimateOscillator UltimateOscillator(
      MarketSeries marketSeries,
      java.lang.Integer cycle1,
      java.lang.Integer cycle2,
      java.lang.Integer cycle3);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public DirectionalMovementSystem DirectionalMovementSystem(java.lang.Integer periods);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public DirectionalMovementSystem DirectionalMovementSystem(
      MarketSeries marketSeries, java.lang.Integer periods);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public ParabolicSAR ParabolicSAR(java.lang.Double minAf, java.lang.Double maxAf);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public ParabolicSAR ParabolicSAR(
      MarketSeries marketSeries, java.lang.Double minAf, java.lang.Double maxAf);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public StochasticOscillator StochasticOscillator(
      java.lang.Integer kPeriods,
      java.lang.Integer kSlowing,
      java.lang.Integer dPeriods,
      MovingAverageType maType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public StochasticOscillator StochasticOscillator(
      MarketSeries marketSeries,
      java.lang.Integer kPeriods,
      java.lang.Integer kSlowing,
      java.lang.Integer dPeriods,
      MovingAverageType maType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public MomentumOscillator MomentumOscillator(DataSeries source, java.lang.Integer periods);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public MedianPrice MedianPrice();
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public MedianPrice MedianPrice(MarketSeries marketSeries);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public WilliamsAccumulationDistribution WilliamsAccumulationDistribution();
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public WilliamsAccumulationDistribution WilliamsAccumulationDistribution(
      MarketSeries marketSeries);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public FractalChaosBands FractalChaosBands(java.lang.Integer periods);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public FractalChaosBands FractalChaosBands(MarketSeries marketSeries, java.lang.Integer periods);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public TypicalPrice TypicalPrice();
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public TypicalPrice TypicalPrice(MarketSeries marketSeries);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public CommodityChannelIndex CommodityChannelIndex(java.lang.Integer periods);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public CommodityChannelIndex CommodityChannelIndex(
      MarketSeries marketSeries, java.lang.Integer periods);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public HistoricalVolatility HistoricalVolatility(
      DataSeries source, java.lang.Integer periods, java.lang.Integer barHistory);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public MassIndex MassIndex(java.lang.Integer periods);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public MassIndex MassIndex(MarketSeries marketSeries, java.lang.Integer periods);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public ChaikinVolatility ChaikinVolatility(
      java.lang.Integer periods, java.lang.Integer rateOfChange, MovingAverageType maType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public ChaikinVolatility ChaikinVolatility(
      MarketSeries marketSeries,
      java.lang.Integer periods,
      java.lang.Integer rateOfChange,
      MovingAverageType maType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public DetrendedPriceOscillator DetrendedPriceOscillator(
      DataSeries source, java.lang.Integer periods, MovingAverageType maType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public LinearRegressionIntercept LinearRegressionIntercept(
      DataSeries source, java.lang.Integer periods);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public LinearRegressionSlope LinearRegressionSlope(DataSeries source, java.lang.Integer periods);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public MacdHistogram MacdHistogram(
      java.lang.Integer longCycle, java.lang.Integer shortCycle, java.lang.Integer signalPeriods);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public MacdHistogram MacdHistogram(
      DataSeries source,
      java.lang.Integer longCycle,
      java.lang.Integer shortCycle,
      java.lang.Integer signalPeriods);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public MacdCrossOver MacdCrossOver(
      java.lang.Integer longCycle, java.lang.Integer shortCycle, java.lang.Integer signalPeriods);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public MacdCrossOver MacdCrossOver(
      DataSeries source,
      java.lang.Integer longCycle,
      java.lang.Integer shortCycle,
      java.lang.Integer signalPeriods);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public PriceOscillator PriceOscillator(
      DataSeries source,
      java.lang.Integer longCycle,
      java.lang.Integer shortCycle,
      MovingAverageType maType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public RainbowOscillator RainbowOscillator(
      DataSeries source, java.lang.Integer levels, MovingAverageType maType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public VerticalHorizontalFilter VerticalHorizontalFilter(
      DataSeries source, java.lang.Integer periods);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public WilliamsPctR WilliamsPctR(java.lang.Integer periods);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public WilliamsPctR WilliamsPctR(MarketSeries marketSeries, java.lang.Integer periods);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public Trix Trix(DataSeries source, java.lang.Integer periods);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public WeightedClose WeightedClose();
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public WeightedClose WeightedClose(MarketSeries marketSeries);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public ChaikinMoneyFlow ChaikinMoneyFlow(java.lang.Integer periods);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public ChaikinMoneyFlow ChaikinMoneyFlow(MarketSeries marketSeries, java.lang.Integer periods);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public EaseOfMovement EaseOfMovement(java.lang.Integer periods, MovingAverageType maType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public EaseOfMovement EaseOfMovement(
      MarketSeries marketSeries, java.lang.Integer periods, MovingAverageType maType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public MoneyFlowIndex MoneyFlowIndex(java.lang.Integer periods);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public MoneyFlowIndex MoneyFlowIndex(MarketSeries marketSeries, java.lang.Integer periods);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public NegativeVolumeIndex NegativeVolumeIndex(DataSeries source);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public OnBalanceVolume OnBalanceVolume(DataSeries source);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public PositiveVolumeIndex PositiveVolumeIndex(DataSeries source);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public PriceVolumeTrend PriceVolumeTrend(DataSeries source);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public TradeVolumeIndex TradeVolumeIndex(DataSeries source);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public VolumeOscillator VolumeOscillator(java.lang.Integer shortTerm, java.lang.Integer longTerm);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public VolumeOscillator VolumeOscillator(
      MarketSeries marketSeries, java.lang.Integer shortTerm, java.lang.Integer longTerm);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public VolumeROC VolumeROC(java.lang.Integer periods);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public VolumeROC VolumeROC(MarketSeries marketSeries, java.lang.Integer periods);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public AverageTrueRange AverageTrueRange(java.lang.Integer periods, MovingAverageType maType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public AverageTrueRange AverageTrueRange(
      MarketSeries marketSeries, java.lang.Integer periods, MovingAverageType maType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public DonchianChannel DonchianChannel(java.lang.Integer periods);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public DonchianChannel DonchianChannel(MarketSeries marketSeries, java.lang.Integer periods);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IchimokuKinkoHyo IchimokuKinkoHyo(
      java.lang.Integer tenkanSenPeriods,
      java.lang.Integer kijunSenPeriods,
      java.lang.Integer senkouSpanBPeriods);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IchimokuKinkoHyo IchimokuKinkoHyo(
      MarketSeries marketSeries,
      java.lang.Integer tenkanSenPeriods,
      java.lang.Integer kijunSenPeriods,
      java.lang.Integer senkouSpanBPeriods);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public AwesomeOscillator AwesomeOscillator();
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public AcceleratorOscillator AcceleratorOscillator();
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public AwesomeOscillator AwesomeOscillator(MarketSeries marketSeries);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public AcceleratorOscillator AcceleratorOscillator(MarketSeries marketSeries);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public KeltnerChannels KeltnerChannels(
      java.lang.Integer maPeriod,
      MovingAverageType maType,
      java.lang.Integer atrPeriod,
      MovingAverageType atrMaType,
      java.lang.Double bandDistance);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public KeltnerChannels KeltnerChannels(
      MarketSeries marketSeries,
      java.lang.Integer maPeriod,
      MovingAverageType maType,
      java.lang.Integer atrPeriod,
      MovingAverageType atrMaType,
      java.lang.Double bandDistance);
}

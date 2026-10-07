//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_adapter_factory_properties.g.dart';

/// ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties
///
/// Properties:
/// * [cqPeriodAnalyticsPeriodAdapterfactoryPeriodContextstores] 
@BuiltValue()
abstract class ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties implements Built<ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties, ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryPropertiesBuilder> {
  @BuiltValueField(wireName: r'cq.analytics.adapterfactory.contextstores')
  ConfigNodePropertyArray? get cqPeriodAnalyticsPeriodAdapterfactoryPeriodContextstores;

  ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties._();

  factory ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties([void updates(ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryPropertiesBuilder b)]) = _$ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties> get serializer => _$ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryPropertiesSerializer();
}

class _$ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryPropertiesSerializer implements PrimitiveSerializer<ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties, _$ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties];

  @override
  final String wireName = r'ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.cqPeriodAnalyticsPeriodAdapterfactoryPeriodContextstores != null) {
      yield r'cq.analytics.adapterfactory.contextstores';
      yield serializers.serialize(
        object.cqPeriodAnalyticsPeriodAdapterfactoryPeriodContextstores,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'cq.analytics.adapterfactory.contextstores':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.cqPeriodAnalyticsPeriodAdapterfactoryPeriodContextstores.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryPropertiesBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}


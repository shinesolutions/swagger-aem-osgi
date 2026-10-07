//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_system_monitoring_impl_system_stats_m_bean_impl_properties.g.dart';

/// ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties
///
/// Properties:
/// * [schedulerPeriodExpression] 
/// * [jmxPeriodObjectname] 
@BuiltValue()
abstract class ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties implements Built<ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties, ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'scheduler.expression')
  ConfigNodePropertyString? get schedulerPeriodExpression;

  @BuiltValueField(wireName: r'jmx.objectname')
  ConfigNodePropertyString? get jmxPeriodObjectname;

  ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties._();

  factory ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties([void updates(ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplPropertiesBuilder b)]) = _$ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties> get serializer => _$ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplPropertiesSerializer();
}

class _$ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties, _$ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties];

  @override
  final String wireName = r'ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.schedulerPeriodExpression != null) {
      yield r'scheduler.expression';
      yield serializers.serialize(
        object.schedulerPeriodExpression,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.jmxPeriodObjectname != null) {
      yield r'jmx.objectname';
      yield serializers.serialize(
        object.jmxPeriodObjectname,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'scheduler.expression':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.schedulerPeriodExpression.replace(valueDes);
          break;
        case r'jmx.objectname':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.jmxPeriodObjectname.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplPropertiesBuilder();
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


//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_screens_impl_jobs_distributed_devices_stati_update_job_properties.g.dart';

/// ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties
///
/// Properties:
/// * [schedulerPeriodExpression] 
@BuiltValue()
abstract class ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties implements Built<ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties, ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobPropertiesBuilder> {
  @BuiltValueField(wireName: r'scheduler.expression')
  ConfigNodePropertyString? get schedulerPeriodExpression;

  ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties._();

  factory ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties([void updates(ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobPropertiesBuilder b)]) = _$ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties> get serializer => _$ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobPropertiesSerializer();
}

class _$ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties, _$ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties];

  @override
  final String wireName = r'ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.schedulerPeriodExpression != null) {
      yield r'scheduler.expression';
      yield serializers.serialize(
        object.schedulerPeriodExpression,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobPropertiesBuilder result,
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
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobPropertiesBuilder();
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


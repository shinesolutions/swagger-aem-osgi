//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_properties.g.dart';

/// ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties
///
/// Properties:
/// * [archivingPeriodEnabled] 
/// * [schedulerPeriodExpression] 
/// * [archivePeriodSincePeriodDaysPeriodCompleted] 
@BuiltValue()
abstract class ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties implements Built<ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties, ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServicePropertiesBuilder> {
  @BuiltValueField(wireName: r'archiving.enabled')
  ConfigNodePropertyBoolean? get archivingPeriodEnabled;

  @BuiltValueField(wireName: r'scheduler.expression')
  ConfigNodePropertyString? get schedulerPeriodExpression;

  @BuiltValueField(wireName: r'archive.since.days.completed')
  ConfigNodePropertyInteger? get archivePeriodSincePeriodDaysPeriodCompleted;

  ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties._();

  factory ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties([void updates(ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServicePropertiesBuilder b)]) = _$ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServicePropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties> get serializer => _$ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServicePropertiesSerializer();
}

class _$ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServicePropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties, _$ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties];

  @override
  final String wireName = r'ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.archivingPeriodEnabled != null) {
      yield r'archiving.enabled';
      yield serializers.serialize(
        object.archivingPeriodEnabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.schedulerPeriodExpression != null) {
      yield r'scheduler.expression';
      yield serializers.serialize(
        object.schedulerPeriodExpression,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.archivePeriodSincePeriodDaysPeriodCompleted != null) {
      yield r'archive.since.days.completed';
      yield serializers.serialize(
        object.archivePeriodSincePeriodDaysPeriodCompleted,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServicePropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'archiving.enabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.archivingPeriodEnabled.replace(valueDes);
          break;
        case r'scheduler.expression':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.schedulerPeriodExpression.replace(valueDes);
          break;
        case r'archive.since.days.completed':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.archivePeriodSincePeriodDaysPeriodCompleted.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServicePropertiesBuilder();
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


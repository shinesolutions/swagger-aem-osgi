//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_fd_fp_config_forms_portal_scheduler_service_properties.g.dart';

/// ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties
///
/// Properties:
/// * [formportalPeriodInterval] 
@BuiltValue()
abstract class ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties implements Built<ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties, ComAdobeFdFpConfigFormsPortalSchedulerServicePropertiesBuilder> {
  @BuiltValueField(wireName: r'formportal.interval')
  ConfigNodePropertyString? get formportalPeriodInterval;

  ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties._();

  factory ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties([void updates(ComAdobeFdFpConfigFormsPortalSchedulerServicePropertiesBuilder b)]) = _$ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeFdFpConfigFormsPortalSchedulerServicePropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties> get serializer => _$ComAdobeFdFpConfigFormsPortalSchedulerServicePropertiesSerializer();
}

class _$ComAdobeFdFpConfigFormsPortalSchedulerServicePropertiesSerializer implements PrimitiveSerializer<ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties, _$ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties];

  @override
  final String wireName = r'ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.formportalPeriodInterval != null) {
      yield r'formportal.interval';
      yield serializers.serialize(
        object.formportalPeriodInterval,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeFdFpConfigFormsPortalSchedulerServicePropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'formportal.interval':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.formportalPeriodInterval.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeFdFpConfigFormsPortalSchedulerServicePropertiesBuilder();
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


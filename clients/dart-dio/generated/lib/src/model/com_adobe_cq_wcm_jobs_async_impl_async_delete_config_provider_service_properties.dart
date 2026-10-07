//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_wcm_jobs_async_impl_async_delete_config_provider_service_properties.g.dart';

/// ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties
///
/// Properties:
/// * [threshold] 
/// * [jobTopicName] 
/// * [emailEnabled] 
@BuiltValue()
abstract class ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties implements Built<ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties, ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServicePropertiesBuilder> {
  @BuiltValueField(wireName: r'threshold')
  ConfigNodePropertyInteger? get threshold;

  @BuiltValueField(wireName: r'jobTopicName')
  ConfigNodePropertyString? get jobTopicName;

  @BuiltValueField(wireName: r'emailEnabled')
  ConfigNodePropertyBoolean? get emailEnabled;

  ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties._();

  factory ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties([void updates(ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServicePropertiesBuilder b)]) = _$ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServicePropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties> get serializer => _$ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServicePropertiesSerializer();
}

class _$ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServicePropertiesSerializer implements PrimitiveSerializer<ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties, _$ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties];

  @override
  final String wireName = r'ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.threshold != null) {
      yield r'threshold';
      yield serializers.serialize(
        object.threshold,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.jobTopicName != null) {
      yield r'jobTopicName';
      yield serializers.serialize(
        object.jobTopicName,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.emailEnabled != null) {
      yield r'emailEnabled';
      yield serializers.serialize(
        object.emailEnabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServicePropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'threshold':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.threshold.replace(valueDes);
          break;
        case r'jobTopicName':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.jobTopicName.replace(valueDes);
          break;
        case r'emailEnabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.emailEnabled.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServicePropertiesBuilder();
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


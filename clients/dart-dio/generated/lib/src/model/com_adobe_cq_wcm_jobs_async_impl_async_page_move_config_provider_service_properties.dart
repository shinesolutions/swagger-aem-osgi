//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service_properties.g.dart';

/// ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties
///
/// Properties:
/// * [threshold] 
/// * [jobTopicName] 
/// * [emailEnabled] 
@BuiltValue()
abstract class ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties implements Built<ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties, ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServicePropertiesBuilder> {
  @BuiltValueField(wireName: r'threshold')
  ConfigNodePropertyInteger? get threshold;

  @BuiltValueField(wireName: r'jobTopicName')
  ConfigNodePropertyString? get jobTopicName;

  @BuiltValueField(wireName: r'emailEnabled')
  ConfigNodePropertyBoolean? get emailEnabled;

  ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties._();

  factory ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties([void updates(ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServicePropertiesBuilder b)]) = _$ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServicePropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties> get serializer => _$ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServicePropertiesSerializer();
}

class _$ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServicePropertiesSerializer implements PrimitiveSerializer<ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties, _$ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties];

  @override
  final String wireName = r'ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties object, {
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
    ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServicePropertiesBuilder result,
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
  ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServicePropertiesBuilder();
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


//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_social_user_impl_transport_http_to_publisher_properties.g.dart';

/// ComAdobeCqSocialUserImplTransportHttpToPublisherProperties
///
/// Properties:
/// * [enable] 
/// * [agentPeriodConfiguration] 
/// * [contextPeriodPath] 
/// * [disabledPeriodCipherPeriodSuites] 
/// * [enabledPeriodCipherPeriodSuites] 
@BuiltValue()
abstract class ComAdobeCqSocialUserImplTransportHttpToPublisherProperties implements Built<ComAdobeCqSocialUserImplTransportHttpToPublisherProperties, ComAdobeCqSocialUserImplTransportHttpToPublisherPropertiesBuilder> {
  @BuiltValueField(wireName: r'enable')
  ConfigNodePropertyBoolean? get enable;

  @BuiltValueField(wireName: r'agent.configuration')
  ConfigNodePropertyArray? get agentPeriodConfiguration;

  @BuiltValueField(wireName: r'context.path')
  ConfigNodePropertyString? get contextPeriodPath;

  @BuiltValueField(wireName: r'disabled.cipher.suites')
  ConfigNodePropertyArray? get disabledPeriodCipherPeriodSuites;

  @BuiltValueField(wireName: r'enabled.cipher.suites')
  ConfigNodePropertyArray? get enabledPeriodCipherPeriodSuites;

  ComAdobeCqSocialUserImplTransportHttpToPublisherProperties._();

  factory ComAdobeCqSocialUserImplTransportHttpToPublisherProperties([void updates(ComAdobeCqSocialUserImplTransportHttpToPublisherPropertiesBuilder b)]) = _$ComAdobeCqSocialUserImplTransportHttpToPublisherProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSocialUserImplTransportHttpToPublisherPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSocialUserImplTransportHttpToPublisherProperties> get serializer => _$ComAdobeCqSocialUserImplTransportHttpToPublisherPropertiesSerializer();
}

class _$ComAdobeCqSocialUserImplTransportHttpToPublisherPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSocialUserImplTransportHttpToPublisherProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSocialUserImplTransportHttpToPublisherProperties, _$ComAdobeCqSocialUserImplTransportHttpToPublisherProperties];

  @override
  final String wireName = r'ComAdobeCqSocialUserImplTransportHttpToPublisherProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSocialUserImplTransportHttpToPublisherProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.enable != null) {
      yield r'enable';
      yield serializers.serialize(
        object.enable,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.agentPeriodConfiguration != null) {
      yield r'agent.configuration';
      yield serializers.serialize(
        object.agentPeriodConfiguration,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.contextPeriodPath != null) {
      yield r'context.path';
      yield serializers.serialize(
        object.contextPeriodPath,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.disabledPeriodCipherPeriodSuites != null) {
      yield r'disabled.cipher.suites';
      yield serializers.serialize(
        object.disabledPeriodCipherPeriodSuites,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.enabledPeriodCipherPeriodSuites != null) {
      yield r'enabled.cipher.suites';
      yield serializers.serialize(
        object.enabledPeriodCipherPeriodSuites,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqSocialUserImplTransportHttpToPublisherProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSocialUserImplTransportHttpToPublisherPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'enable':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.enable.replace(valueDes);
          break;
        case r'agent.configuration':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.agentPeriodConfiguration.replace(valueDes);
          break;
        case r'context.path':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.contextPeriodPath.replace(valueDes);
          break;
        case r'disabled.cipher.suites':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.disabledPeriodCipherPeriodSuites.replace(valueDes);
          break;
        case r'enabled.cipher.suites':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.enabledPeriodCipherPeriodSuites.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqSocialUserImplTransportHttpToPublisherProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSocialUserImplTransportHttpToPublisherPropertiesBuilder();
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


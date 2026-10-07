//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties.g.dart';

/// ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties
///
/// Properties:
/// * [oauthPeriodConfigmanagerPeriodImsPeriodConfigid] 
/// * [imsPeriodOwningEntity] 
/// * [aemPeriodInstanceId] 
/// * [imsPeriodServiceCode] 
@BuiltValue()
abstract class ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties implements Built<ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties, ComAdobeGraniteAuthImsImplImsConfigProviderImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'oauth.configmanager.ims.configid')
  ConfigNodePropertyString? get oauthPeriodConfigmanagerPeriodImsPeriodConfigid;

  @BuiltValueField(wireName: r'ims.owningEntity')
  ConfigNodePropertyString? get imsPeriodOwningEntity;

  @BuiltValueField(wireName: r'aem.instanceId')
  ConfigNodePropertyString? get aemPeriodInstanceId;

  @BuiltValueField(wireName: r'ims.serviceCode')
  ConfigNodePropertyString? get imsPeriodServiceCode;

  ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties._();

  factory ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties([void updates(ComAdobeGraniteAuthImsImplImsConfigProviderImplPropertiesBuilder b)]) = _$ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteAuthImsImplImsConfigProviderImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties> get serializer => _$ComAdobeGraniteAuthImsImplImsConfigProviderImplPropertiesSerializer();
}

class _$ComAdobeGraniteAuthImsImplImsConfigProviderImplPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties, _$ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties];

  @override
  final String wireName = r'ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.oauthPeriodConfigmanagerPeriodImsPeriodConfigid != null) {
      yield r'oauth.configmanager.ims.configid';
      yield serializers.serialize(
        object.oauthPeriodConfigmanagerPeriodImsPeriodConfigid,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.imsPeriodOwningEntity != null) {
      yield r'ims.owningEntity';
      yield serializers.serialize(
        object.imsPeriodOwningEntity,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.aemPeriodInstanceId != null) {
      yield r'aem.instanceId';
      yield serializers.serialize(
        object.aemPeriodInstanceId,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.imsPeriodServiceCode != null) {
      yield r'ims.serviceCode';
      yield serializers.serialize(
        object.imsPeriodServiceCode,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteAuthImsImplImsConfigProviderImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'oauth.configmanager.ims.configid':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.oauthPeriodConfigmanagerPeriodImsPeriodConfigid.replace(valueDes);
          break;
        case r'ims.owningEntity':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.imsPeriodOwningEntity.replace(valueDes);
          break;
        case r'aem.instanceId':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.aemPeriodInstanceId.replace(valueDes);
          break;
        case r'ims.serviceCode':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.imsPeriodServiceCode.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteAuthImsImplImsConfigProviderImplPropertiesBuilder();
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


//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties.g.dart';

/// ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties
///
/// Properties:
/// * [name] 
/// * [serviceName] 
/// * [userId] 
/// * [accessTokenProviderPeriodTarget] 
@BuiltValue()
abstract class ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties implements Built<ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties, ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuPropertiesBuilder> {
  @BuiltValueField(wireName: r'name')
  ConfigNodePropertyString? get name;

  @BuiltValueField(wireName: r'serviceName')
  ConfigNodePropertyString? get serviceName;

  @BuiltValueField(wireName: r'userId')
  ConfigNodePropertyString? get userId;

  @BuiltValueField(wireName: r'accessTokenProvider.target')
  ConfigNodePropertyString? get accessTokenProviderPeriodTarget;

  ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties._();

  factory ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties([void updates(ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuPropertiesBuilder b)]) = _$ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties> get serializer => _$ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuPropertiesSerializer();
}

class _$ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties, _$ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties];

  @override
  final String wireName = r'ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.name != null) {
      yield r'name';
      yield serializers.serialize(
        object.name,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.serviceName != null) {
      yield r'serviceName';
      yield serializers.serialize(
        object.serviceName,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.userId != null) {
      yield r'userId';
      yield serializers.serialize(
        object.userId,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.accessTokenProviderPeriodTarget != null) {
      yield r'accessTokenProvider.target';
      yield serializers.serialize(
        object.accessTokenProviderPeriodTarget,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.name.replace(valueDes);
          break;
        case r'serviceName':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.serviceName.replace(valueDes);
          break;
        case r'userId':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.userId.replace(valueDes);
          break;
        case r'accessTokenProvider.target':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.accessTokenProviderPeriodTarget.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuPropertiesBuilder();
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


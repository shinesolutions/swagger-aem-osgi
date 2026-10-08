//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_octopus_ncomm_bootstrap_properties.g.dart';

/// ComAdobeOctopusNcommBootstrapProperties
///
/// Properties:
/// * [maxConnections] 
/// * [maxRequests] 
/// * [requestTimeout] 
/// * [requestRetries] 
/// * [launchTimeout] 
@BuiltValue()
abstract class ComAdobeOctopusNcommBootstrapProperties implements Built<ComAdobeOctopusNcommBootstrapProperties, ComAdobeOctopusNcommBootstrapPropertiesBuilder> {
  @BuiltValueField(wireName: r'maxConnections')
  ConfigNodePropertyInteger? get maxConnections;

  @BuiltValueField(wireName: r'maxRequests')
  ConfigNodePropertyInteger? get maxRequests;

  @BuiltValueField(wireName: r'requestTimeout')
  ConfigNodePropertyInteger? get requestTimeout;

  @BuiltValueField(wireName: r'requestRetries')
  ConfigNodePropertyInteger? get requestRetries;

  @BuiltValueField(wireName: r'launchTimeout')
  ConfigNodePropertyInteger? get launchTimeout;

  ComAdobeOctopusNcommBootstrapProperties._();

  factory ComAdobeOctopusNcommBootstrapProperties([void updates(ComAdobeOctopusNcommBootstrapPropertiesBuilder b)]) = _$ComAdobeOctopusNcommBootstrapProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeOctopusNcommBootstrapPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeOctopusNcommBootstrapProperties> get serializer => _$ComAdobeOctopusNcommBootstrapPropertiesSerializer();
}

class _$ComAdobeOctopusNcommBootstrapPropertiesSerializer implements PrimitiveSerializer<ComAdobeOctopusNcommBootstrapProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeOctopusNcommBootstrapProperties, _$ComAdobeOctopusNcommBootstrapProperties];

  @override
  final String wireName = r'ComAdobeOctopusNcommBootstrapProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeOctopusNcommBootstrapProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.maxConnections != null) {
      yield r'maxConnections';
      yield serializers.serialize(
        object.maxConnections,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.maxRequests != null) {
      yield r'maxRequests';
      yield serializers.serialize(
        object.maxRequests,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.requestTimeout != null) {
      yield r'requestTimeout';
      yield serializers.serialize(
        object.requestTimeout,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.requestRetries != null) {
      yield r'requestRetries';
      yield serializers.serialize(
        object.requestRetries,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.launchTimeout != null) {
      yield r'launchTimeout';
      yield serializers.serialize(
        object.launchTimeout,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeOctopusNcommBootstrapProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeOctopusNcommBootstrapPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'maxConnections':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.maxConnections.replace(valueDes);
          break;
        case r'maxRequests':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.maxRequests.replace(valueDes);
          break;
        case r'requestTimeout':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.requestTimeout.replace(valueDes);
          break;
        case r'requestRetries':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.requestRetries.replace(valueDes);
          break;
        case r'launchTimeout':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.launchTimeout.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeOctopusNcommBootstrapProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeOctopusNcommBootstrapPropertiesBuilder();
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


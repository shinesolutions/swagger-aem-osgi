//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_properties.g.dart';

/// ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties
///
/// Properties:
/// * [enabled] 
/// * [fallbackPaths] 
@BuiltValue()
abstract class ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties implements Built<ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties, ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingPropertiesBuilder> {
  @BuiltValueField(wireName: r'enabled')
  ConfigNodePropertyBoolean? get enabled;

  @BuiltValueField(wireName: r'fallbackPaths')
  ConfigNodePropertyArray? get fallbackPaths;

  ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties._();

  factory ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties([void updates(ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingPropertiesBuilder b)]) = _$ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties> get serializer => _$ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingPropertiesSerializer();
}

class _$ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties, _$ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties];

  @override
  final String wireName = r'ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.enabled != null) {
      yield r'enabled';
      yield serializers.serialize(
        object.enabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.fallbackPaths != null) {
      yield r'fallbackPaths';
      yield serializers.serialize(
        object.fallbackPaths,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'enabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.enabled.replace(valueDes);
          break;
        case r'fallbackPaths':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.fallbackPaths.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingPropertiesBuilder();
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


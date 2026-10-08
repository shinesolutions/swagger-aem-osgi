//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_rest_impl_api_endpoint_resource_provider_factory_impl_properties.g.dart';

/// ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties
///
/// Properties:
/// * [providerPeriodRoots] 
@BuiltValue()
abstract class ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties implements Built<ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties, ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'provider.roots')
  ConfigNodePropertyString? get providerPeriodRoots;

  ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties._();

  factory ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties([void updates(ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplPropertiesBuilder b)]) = _$ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties> get serializer => _$ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplPropertiesSerializer();
}

class _$ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties, _$ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties];

  @override
  final String wireName = r'ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.providerPeriodRoots != null) {
      yield r'provider.roots';
      yield serializers.serialize(
        object.providerPeriodRoots,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'provider.roots':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.providerPeriodRoots.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplPropertiesBuilder();
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


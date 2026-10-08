//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_resourcestatus_impl_status_resource_provider_impl_properties.g.dart';

/// ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties
///
/// Properties:
/// * [providerPeriodRoot] 
@BuiltValue()
abstract class ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties implements Built<ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties, ComAdobeGraniteResourcestatusImplStatusResourceProviderImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'provider.root')
  ConfigNodePropertyString? get providerPeriodRoot;

  ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties._();

  factory ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties([void updates(ComAdobeGraniteResourcestatusImplStatusResourceProviderImplPropertiesBuilder b)]) = _$ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteResourcestatusImplStatusResourceProviderImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties> get serializer => _$ComAdobeGraniteResourcestatusImplStatusResourceProviderImplPropertiesSerializer();
}

class _$ComAdobeGraniteResourcestatusImplStatusResourceProviderImplPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties, _$ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties];

  @override
  final String wireName = r'ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.providerPeriodRoot != null) {
      yield r'provider.root';
      yield serializers.serialize(
        object.providerPeriodRoot,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteResourcestatusImplStatusResourceProviderImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'provider.root':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.providerPeriodRoot.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteResourcestatusImplStatusResourceProviderImplPropertiesBuilder();
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


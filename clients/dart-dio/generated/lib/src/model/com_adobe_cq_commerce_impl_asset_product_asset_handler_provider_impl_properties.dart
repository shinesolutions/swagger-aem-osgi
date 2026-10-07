//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_commerce_impl_asset_product_asset_handler_provider_impl_properties.g.dart';

/// ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties
///
/// Properties:
/// * [cqPeriodCommercePeriodAssetPeriodHandlerPeriodFallback] 
@BuiltValue()
abstract class ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties implements Built<ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties, ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'cq.commerce.asset.handler.fallback')
  ConfigNodePropertyString? get cqPeriodCommercePeriodAssetPeriodHandlerPeriodFallback;

  ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties._();

  factory ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties([void updates(ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplPropertiesBuilder b)]) = _$ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties> get serializer => _$ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplPropertiesSerializer();
}

class _$ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties, _$ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties];

  @override
  final String wireName = r'ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.cqPeriodCommercePeriodAssetPeriodHandlerPeriodFallback != null) {
      yield r'cq.commerce.asset.handler.fallback';
      yield serializers.serialize(
        object.cqPeriodCommercePeriodAssetPeriodHandlerPeriodFallback,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'cq.commerce.asset.handler.fallback':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.cqPeriodCommercePeriodAssetPeriodHandlerPeriodFallback.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplPropertiesBuilder();
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


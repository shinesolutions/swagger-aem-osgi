//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_commerce_impl_asset_static_image_handler_properties.g.dart';

/// ComAdobeCqCommerceImplAssetStaticImageHandlerProperties
///
/// Properties:
/// * [cqPeriodCommercePeriodAssetPeriodHandlerPeriodActive] 
/// * [cqPeriodCommercePeriodAssetPeriodHandlerPeriodName] 
@BuiltValue()
abstract class ComAdobeCqCommerceImplAssetStaticImageHandlerProperties implements Built<ComAdobeCqCommerceImplAssetStaticImageHandlerProperties, ComAdobeCqCommerceImplAssetStaticImageHandlerPropertiesBuilder> {
  @BuiltValueField(wireName: r'cq.commerce.asset.handler.active')
  ConfigNodePropertyBoolean? get cqPeriodCommercePeriodAssetPeriodHandlerPeriodActive;

  @BuiltValueField(wireName: r'cq.commerce.asset.handler.name')
  ConfigNodePropertyString? get cqPeriodCommercePeriodAssetPeriodHandlerPeriodName;

  ComAdobeCqCommerceImplAssetStaticImageHandlerProperties._();

  factory ComAdobeCqCommerceImplAssetStaticImageHandlerProperties([void updates(ComAdobeCqCommerceImplAssetStaticImageHandlerPropertiesBuilder b)]) = _$ComAdobeCqCommerceImplAssetStaticImageHandlerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqCommerceImplAssetStaticImageHandlerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqCommerceImplAssetStaticImageHandlerProperties> get serializer => _$ComAdobeCqCommerceImplAssetStaticImageHandlerPropertiesSerializer();
}

class _$ComAdobeCqCommerceImplAssetStaticImageHandlerPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqCommerceImplAssetStaticImageHandlerProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqCommerceImplAssetStaticImageHandlerProperties, _$ComAdobeCqCommerceImplAssetStaticImageHandlerProperties];

  @override
  final String wireName = r'ComAdobeCqCommerceImplAssetStaticImageHandlerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqCommerceImplAssetStaticImageHandlerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.cqPeriodCommercePeriodAssetPeriodHandlerPeriodActive != null) {
      yield r'cq.commerce.asset.handler.active';
      yield serializers.serialize(
        object.cqPeriodCommercePeriodAssetPeriodHandlerPeriodActive,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.cqPeriodCommercePeriodAssetPeriodHandlerPeriodName != null) {
      yield r'cq.commerce.asset.handler.name';
      yield serializers.serialize(
        object.cqPeriodCommercePeriodAssetPeriodHandlerPeriodName,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqCommerceImplAssetStaticImageHandlerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqCommerceImplAssetStaticImageHandlerPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'cq.commerce.asset.handler.active':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.cqPeriodCommercePeriodAssetPeriodHandlerPeriodActive.replace(valueDes);
          break;
        case r'cq.commerce.asset.handler.name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.cqPeriodCommercePeriodAssetPeriodHandlerPeriodName.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqCommerceImplAssetStaticImageHandlerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqCommerceImplAssetStaticImageHandlerPropertiesBuilder();
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


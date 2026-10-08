//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_commerce_impl_promotion_promotion_manager_impl_properties.g.dart';

/// ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties
///
/// Properties:
/// * [cqPeriodCommercePeriodPromotionPeriodRoot] 
@BuiltValue()
abstract class ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties implements Built<ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties, ComAdobeCqCommerceImplPromotionPromotionManagerImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'cq.commerce.promotion.root')
  ConfigNodePropertyString? get cqPeriodCommercePeriodPromotionPeriodRoot;

  ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties._();

  factory ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties([void updates(ComAdobeCqCommerceImplPromotionPromotionManagerImplPropertiesBuilder b)]) = _$ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqCommerceImplPromotionPromotionManagerImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties> get serializer => _$ComAdobeCqCommerceImplPromotionPromotionManagerImplPropertiesSerializer();
}

class _$ComAdobeCqCommerceImplPromotionPromotionManagerImplPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties, _$ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties];

  @override
  final String wireName = r'ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.cqPeriodCommercePeriodPromotionPeriodRoot != null) {
      yield r'cq.commerce.promotion.root';
      yield serializers.serialize(
        object.cqPeriodCommercePeriodPromotionPeriodRoot,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqCommerceImplPromotionPromotionManagerImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'cq.commerce.promotion.root':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.cqPeriodCommercePeriodPromotionPeriodRoot.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqCommerceImplPromotionPromotionManagerImplPropertiesBuilder();
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


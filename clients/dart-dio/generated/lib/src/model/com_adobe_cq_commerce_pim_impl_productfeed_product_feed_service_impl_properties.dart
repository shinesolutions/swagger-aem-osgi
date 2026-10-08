//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_drop_down.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_commerce_pim_impl_productfeed_product_feed_service_impl_properties.g.dart';

/// ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties
///
/// Properties:
/// * [feedGeneratorAlgorithm] 
@BuiltValue()
abstract class ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties implements Built<ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties, ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'Feed generator algorithm')
  ConfigNodePropertyDropDown? get feedGeneratorAlgorithm;

  ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties._();

  factory ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties([void updates(ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplPropertiesBuilder b)]) = _$ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties> get serializer => _$ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplPropertiesSerializer();
}

class _$ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties, _$ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties];

  @override
  final String wireName = r'ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.feedGeneratorAlgorithm != null) {
      yield r'Feed generator algorithm';
      yield serializers.serialize(
        object.feedGeneratorAlgorithm,
        specifiedType: const FullType(ConfigNodePropertyDropDown),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'Feed generator algorithm':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyDropDown),
          ) as ConfigNodePropertyDropDown?;
          if (valueDes == null) continue;
          result.feedGeneratorAlgorithm.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplPropertiesBuilder();
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


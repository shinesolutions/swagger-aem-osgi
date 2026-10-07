//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_rest_assets_impl_asset_content_disposition_filter_properties.g.dart';

/// ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties
///
/// Properties:
/// * [mimePeriodAllowEmpty] 
/// * [mimePeriodAllowed] 
@BuiltValue()
abstract class ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties implements Built<ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties, ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterPropertiesBuilder> {
  @BuiltValueField(wireName: r'mime.allowEmpty')
  ConfigNodePropertyBoolean? get mimePeriodAllowEmpty;

  @BuiltValueField(wireName: r'mime.allowed')
  ConfigNodePropertyArray? get mimePeriodAllowed;

  ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties._();

  factory ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties([void updates(ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterPropertiesBuilder b)]) = _$ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties> get serializer => _$ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterPropertiesSerializer();
}

class _$ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties, _$ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties];

  @override
  final String wireName = r'ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.mimePeriodAllowEmpty != null) {
      yield r'mime.allowEmpty';
      yield serializers.serialize(
        object.mimePeriodAllowEmpty,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.mimePeriodAllowed != null) {
      yield r'mime.allowed';
      yield serializers.serialize(
        object.mimePeriodAllowed,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'mime.allowEmpty':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.mimePeriodAllowEmpty.replace(valueDes);
          break;
        case r'mime.allowed':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.mimePeriodAllowed.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterPropertiesBuilder();
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


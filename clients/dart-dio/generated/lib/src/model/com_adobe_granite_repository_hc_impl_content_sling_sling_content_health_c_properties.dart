//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c_properties.g.dart';

/// ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties
///
/// Properties:
/// * [hcPeriodTags] 
/// * [excludePeriodSearchPeriodPath] 
@BuiltValue()
abstract class ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties implements Built<ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties, ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCPropertiesBuilder> {
  @BuiltValueField(wireName: r'hc.tags')
  ConfigNodePropertyArray? get hcPeriodTags;

  @BuiltValueField(wireName: r'exclude.search.path')
  ConfigNodePropertyArray? get excludePeriodSearchPeriodPath;

  ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties._();

  factory ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties([void updates(ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCPropertiesBuilder b)]) = _$ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties> get serializer => _$ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCPropertiesSerializer();
}

class _$ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties, _$ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties];

  @override
  final String wireName = r'ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.hcPeriodTags != null) {
      yield r'hc.tags';
      yield serializers.serialize(
        object.hcPeriodTags,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.excludePeriodSearchPeriodPath != null) {
      yield r'exclude.search.path';
      yield serializers.serialize(
        object.excludePeriodSearchPeriodPath,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'hc.tags':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.hcPeriodTags.replace(valueDes);
          break;
        case r'exclude.search.path':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.excludePeriodSearchPeriodPath.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCPropertiesBuilder();
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


//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_repository_hc_impl_default_access_user_profile_health_che_properties.g.dart';

/// ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheProperties
///
/// Properties:
/// * [hcPeriodTags] 
@BuiltValue()
abstract class ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheProperties implements Built<ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheProperties, ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthChePropertiesBuilder> {
  @BuiltValueField(wireName: r'hc.tags')
  ConfigNodePropertyArray? get hcPeriodTags;

  ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheProperties._();

  factory ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheProperties([void updates(ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthChePropertiesBuilder b)]) = _$ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthChePropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheProperties> get serializer => _$ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthChePropertiesSerializer();
}

class _$ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthChePropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheProperties, _$ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheProperties];

  @override
  final String wireName = r'ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.hcPeriodTags != null) {
      yield r'hc.tags';
      yield serializers.serialize(
        object.hcPeriodTags,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthChePropertiesBuilder result,
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
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthChePropertiesBuilder();
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


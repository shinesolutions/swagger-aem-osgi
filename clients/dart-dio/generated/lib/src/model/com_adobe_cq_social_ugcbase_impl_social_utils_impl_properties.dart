//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_social_ugcbase_impl_social_utils_impl_properties.g.dart';

/// ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties
///
/// Properties:
/// * [legacyCloudUGCPathMapping] 
@BuiltValue()
abstract class ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties implements Built<ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties, ComAdobeCqSocialUgcbaseImplSocialUtilsImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'legacyCloudUGCPathMapping')
  ConfigNodePropertyBoolean? get legacyCloudUGCPathMapping;

  ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties._();

  factory ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties([void updates(ComAdobeCqSocialUgcbaseImplSocialUtilsImplPropertiesBuilder b)]) = _$ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSocialUgcbaseImplSocialUtilsImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties> get serializer => _$ComAdobeCqSocialUgcbaseImplSocialUtilsImplPropertiesSerializer();
}

class _$ComAdobeCqSocialUgcbaseImplSocialUtilsImplPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties, _$ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties];

  @override
  final String wireName = r'ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.legacyCloudUGCPathMapping != null) {
      yield r'legacyCloudUGCPathMapping';
      yield serializers.serialize(
        object.legacyCloudUGCPathMapping,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSocialUgcbaseImplSocialUtilsImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'legacyCloudUGCPathMapping':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.legacyCloudUGCPathMapping.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSocialUgcbaseImplSocialUtilsImplPropertiesBuilder();
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


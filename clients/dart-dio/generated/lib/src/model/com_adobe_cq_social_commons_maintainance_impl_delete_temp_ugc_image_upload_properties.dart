//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_properties.g.dart';

/// ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties
///
/// Properties:
/// * [numberOfDays] 
/// * [ageOfFile] 
@BuiltValue()
abstract class ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties implements Built<ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties, ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadPropertiesBuilder> {
  @BuiltValueField(wireName: r'numberOfDays')
  ConfigNodePropertyInteger? get numberOfDays;

  @BuiltValueField(wireName: r'ageOfFile')
  ConfigNodePropertyInteger? get ageOfFile;

  ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties._();

  factory ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties([void updates(ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadPropertiesBuilder b)]) = _$ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties> get serializer => _$ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadPropertiesSerializer();
}

class _$ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties, _$ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties];

  @override
  final String wireName = r'ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.numberOfDays != null) {
      yield r'numberOfDays';
      yield serializers.serialize(
        object.numberOfDays,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.ageOfFile != null) {
      yield r'ageOfFile';
      yield serializers.serialize(
        object.ageOfFile,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'numberOfDays':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.numberOfDays.replace(valueDes);
          break;
        case r'ageOfFile':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.ageOfFile.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadPropertiesBuilder();
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


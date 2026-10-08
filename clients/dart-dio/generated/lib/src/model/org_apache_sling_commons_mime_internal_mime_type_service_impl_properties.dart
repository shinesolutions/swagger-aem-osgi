//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_commons_mime_internal_mime_type_service_impl_properties.g.dart';

/// OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties
///
/// Properties:
/// * [mimePeriodTypes] 
@BuiltValue()
abstract class OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties implements Built<OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties, OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'mime.types')
  ConfigNodePropertyArray? get mimePeriodTypes;

  OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties._();

  factory OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties([void updates(OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplPropertiesBuilder b)]) = _$OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties> get serializer => _$OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplPropertiesSerializer();
}

class _$OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties, _$OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties];

  @override
  final String wireName = r'OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.mimePeriodTypes != null) {
      yield r'mime.types';
      yield serializers.serialize(
        object.mimePeriodTypes,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'mime.types':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.mimePeriodTypes.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplPropertiesBuilder();
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


//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_info.g.dart';

/// OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfo
///
/// Properties:
/// * [pid] 
/// * [title] 
/// * [description] 
/// * [properties] 
@BuiltValue()
abstract class OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfo implements Built<OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfo, OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfoBuilder> {
  @BuiltValueField(wireName: r'pid')
  String? get pid;

  @BuiltValueField(wireName: r'title')
  String? get title;

  @BuiltValueField(wireName: r'description')
  String? get description;

  @BuiltValueField(wireName: r'properties')
  OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties? get properties;

  OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfo._();

  factory OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfo([void updates(OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfoBuilder b)]) = _$OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfo;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfoBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfo> get serializer => _$OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfoSerializer();
}

class _$OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfoSerializer implements PrimitiveSerializer<OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfo> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfo, _$OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfo];

  @override
  final String wireName = r'OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfo';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfo object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.pid != null) {
      yield r'pid';
      yield serializers.serialize(
        object.pid,
        specifiedType: const FullType(String),
      );
    }
    if (object.title != null) {
      yield r'title';
      yield serializers.serialize(
        object.title,
        specifiedType: const FullType(String),
      );
    }
    if (object.description != null) {
      yield r'description';
      yield serializers.serialize(
        object.description,
        specifiedType: const FullType(String),
      );
    }
    if (object.properties != null) {
      yield r'properties';
      yield serializers.serialize(
        object.properties,
        specifiedType: const FullType(OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfo object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfoBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'pid':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.pid = valueDes;
          break;
        case r'title':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.title = valueDes;
          break;
        case r'description':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.description = valueDes;
          break;
        case r'properties':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties),
          ) as OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties?;
          if (valueDes == null) continue;
          result.properties.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfo deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfoBuilder();
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


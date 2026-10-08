//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w_properties.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w_info.g.dart';

/// OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfo
///
/// Properties:
/// * [pid] 
/// * [title] 
/// * [description] 
/// * [properties] 
@BuiltValue()
abstract class OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfo implements Built<OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfo, OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfoBuilder> {
  @BuiltValueField(wireName: r'pid')
  String? get pid;

  @BuiltValueField(wireName: r'title')
  String? get title;

  @BuiltValueField(wireName: r'description')
  String? get description;

  @BuiltValueField(wireName: r'properties')
  OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties? get properties;

  OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfo._();

  factory OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfo([void updates(OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfoBuilder b)]) = _$OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfo;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfoBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfo> get serializer => _$OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfoSerializer();
}

class _$OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfoSerializer implements PrimitiveSerializer<OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfo> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfo, _$OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfo];

  @override
  final String wireName = r'OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfo';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfo object, {
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
        specifiedType: const FullType(OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfo object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfoBuilder result,
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
            specifiedType: const FullType.nullable(OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties),
          ) as OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties?;
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
  OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfo deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfoBuilder();
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


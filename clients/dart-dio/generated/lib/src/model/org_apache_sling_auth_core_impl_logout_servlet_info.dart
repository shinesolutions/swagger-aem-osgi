//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/org_apache_sling_auth_core_impl_logout_servlet_properties.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_auth_core_impl_logout_servlet_info.g.dart';

/// OrgApacheSlingAuthCoreImplLogoutServletInfo
///
/// Properties:
/// * [pid] 
/// * [title] 
/// * [description] 
/// * [properties] 
@BuiltValue()
abstract class OrgApacheSlingAuthCoreImplLogoutServletInfo implements Built<OrgApacheSlingAuthCoreImplLogoutServletInfo, OrgApacheSlingAuthCoreImplLogoutServletInfoBuilder> {
  @BuiltValueField(wireName: r'pid')
  String? get pid;

  @BuiltValueField(wireName: r'title')
  String? get title;

  @BuiltValueField(wireName: r'description')
  String? get description;

  @BuiltValueField(wireName: r'properties')
  OrgApacheSlingAuthCoreImplLogoutServletProperties? get properties;

  OrgApacheSlingAuthCoreImplLogoutServletInfo._();

  factory OrgApacheSlingAuthCoreImplLogoutServletInfo([void updates(OrgApacheSlingAuthCoreImplLogoutServletInfoBuilder b)]) = _$OrgApacheSlingAuthCoreImplLogoutServletInfo;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingAuthCoreImplLogoutServletInfoBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingAuthCoreImplLogoutServletInfo> get serializer => _$OrgApacheSlingAuthCoreImplLogoutServletInfoSerializer();
}

class _$OrgApacheSlingAuthCoreImplLogoutServletInfoSerializer implements PrimitiveSerializer<OrgApacheSlingAuthCoreImplLogoutServletInfo> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingAuthCoreImplLogoutServletInfo, _$OrgApacheSlingAuthCoreImplLogoutServletInfo];

  @override
  final String wireName = r'OrgApacheSlingAuthCoreImplLogoutServletInfo';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingAuthCoreImplLogoutServletInfo object, {
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
        specifiedType: const FullType(OrgApacheSlingAuthCoreImplLogoutServletProperties),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingAuthCoreImplLogoutServletInfo object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingAuthCoreImplLogoutServletInfoBuilder result,
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
            specifiedType: const FullType.nullable(OrgApacheSlingAuthCoreImplLogoutServletProperties),
          ) as OrgApacheSlingAuthCoreImplLogoutServletProperties?;
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
  OrgApacheSlingAuthCoreImplLogoutServletInfo deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingAuthCoreImplLogoutServletInfoBuilder();
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


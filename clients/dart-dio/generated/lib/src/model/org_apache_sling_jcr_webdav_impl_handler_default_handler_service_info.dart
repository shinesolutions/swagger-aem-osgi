//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_jcr_webdav_impl_handler_default_handler_service_info.g.dart';

/// OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfo
///
/// Properties:
/// * [pid] 
/// * [title] 
/// * [description] 
/// * [properties] 
@BuiltValue()
abstract class OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfo implements Built<OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfo, OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfoBuilder> {
  @BuiltValueField(wireName: r'pid')
  String? get pid;

  @BuiltValueField(wireName: r'title')
  String? get title;

  @BuiltValueField(wireName: r'description')
  String? get description;

  @BuiltValueField(wireName: r'properties')
  OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties? get properties;

  OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfo._();

  factory OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfo([void updates(OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfoBuilder b)]) = _$OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfo;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfoBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfo> get serializer => _$OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfoSerializer();
}

class _$OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfoSerializer implements PrimitiveSerializer<OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfo> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfo, _$OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfo];

  @override
  final String wireName = r'OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfo';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfo object, {
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
        specifiedType: const FullType(OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfo object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfoBuilder result,
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
            specifiedType: const FullType.nullable(OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties),
          ) as OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties?;
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
  OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfo deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfoBuilder();
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


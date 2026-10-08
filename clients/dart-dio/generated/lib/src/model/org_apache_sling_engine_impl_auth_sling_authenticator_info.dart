//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/org_apache_sling_engine_impl_auth_sling_authenticator_properties.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_engine_impl_auth_sling_authenticator_info.g.dart';

/// OrgApacheSlingEngineImplAuthSlingAuthenticatorInfo
///
/// Properties:
/// * [pid] 
/// * [title] 
/// * [description] 
/// * [properties] 
/// * [bundleLocation] 
/// * [serviceLocation] 
@BuiltValue()
abstract class OrgApacheSlingEngineImplAuthSlingAuthenticatorInfo implements Built<OrgApacheSlingEngineImplAuthSlingAuthenticatorInfo, OrgApacheSlingEngineImplAuthSlingAuthenticatorInfoBuilder> {
  @BuiltValueField(wireName: r'pid')
  String? get pid;

  @BuiltValueField(wireName: r'title')
  String? get title;

  @BuiltValueField(wireName: r'description')
  String? get description;

  @BuiltValueField(wireName: r'properties')
  OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties? get properties;

  @BuiltValueField(wireName: r'bundle_location')
  String? get bundleLocation;

  @BuiltValueField(wireName: r'service_location')
  String? get serviceLocation;

  OrgApacheSlingEngineImplAuthSlingAuthenticatorInfo._();

  factory OrgApacheSlingEngineImplAuthSlingAuthenticatorInfo([void updates(OrgApacheSlingEngineImplAuthSlingAuthenticatorInfoBuilder b)]) = _$OrgApacheSlingEngineImplAuthSlingAuthenticatorInfo;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingEngineImplAuthSlingAuthenticatorInfoBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingEngineImplAuthSlingAuthenticatorInfo> get serializer => _$OrgApacheSlingEngineImplAuthSlingAuthenticatorInfoSerializer();
}

class _$OrgApacheSlingEngineImplAuthSlingAuthenticatorInfoSerializer implements PrimitiveSerializer<OrgApacheSlingEngineImplAuthSlingAuthenticatorInfo> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingEngineImplAuthSlingAuthenticatorInfo, _$OrgApacheSlingEngineImplAuthSlingAuthenticatorInfo];

  @override
  final String wireName = r'OrgApacheSlingEngineImplAuthSlingAuthenticatorInfo';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingEngineImplAuthSlingAuthenticatorInfo object, {
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
        specifiedType: const FullType(OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties),
      );
    }
    if (object.bundleLocation != null) {
      yield r'bundle_location';
      yield serializers.serialize(
        object.bundleLocation,
        specifiedType: const FullType(String),
      );
    }
    if (object.serviceLocation != null) {
      yield r'service_location';
      yield serializers.serialize(
        object.serviceLocation,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingEngineImplAuthSlingAuthenticatorInfo object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingEngineImplAuthSlingAuthenticatorInfoBuilder result,
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
            specifiedType: const FullType.nullable(OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties),
          ) as OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties?;
          if (valueDes == null) continue;
          result.properties.replace(valueDes);
          break;
        case r'bundle_location':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.bundleLocation = valueDes;
          break;
        case r'service_location':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.serviceLocation = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingEngineImplAuthSlingAuthenticatorInfo deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingEngineImplAuthSlingAuthenticatorInfoBuilder();
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


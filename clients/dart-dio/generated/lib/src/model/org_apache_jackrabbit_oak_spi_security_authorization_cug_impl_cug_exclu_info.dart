//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_exclu_properties.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_exclu_info.g.dart';

/// OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo
///
/// Properties:
/// * [pid] 
/// * [title] 
/// * [description] 
/// * [properties] 
@BuiltValue()
abstract class OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo implements Built<OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo, OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfoBuilder> {
  @BuiltValueField(wireName: r'pid')
  String? get pid;

  @BuiltValueField(wireName: r'title')
  String? get title;

  @BuiltValueField(wireName: r'description')
  String? get description;

  @BuiltValueField(wireName: r'properties')
  OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties? get properties;

  OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo._();

  factory OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo([void updates(OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfoBuilder b)]) = _$OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfoBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo> get serializer => _$OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfoSerializer();
}

class _$OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfoSerializer implements PrimitiveSerializer<OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo> {
  @override
  final Iterable<Type> types = const [OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo, _$OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo];

  @override
  final String wireName = r'OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo object, {
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
        specifiedType: const FullType(OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfoBuilder result,
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
            specifiedType: const FullType.nullable(OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties),
          ) as OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties?;
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
  OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfoBuilder();
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


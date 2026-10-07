//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_properties.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_info.g.dart';

/// OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo
///
/// Properties:
/// * [pid] 
/// * [title] 
/// * [description] 
/// * [properties] 
@BuiltValue()
abstract class OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo implements Built<OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo, OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfoBuilder> {
  @BuiltValueField(wireName: r'pid')
  String? get pid;

  @BuiltValueField(wireName: r'title')
  String? get title;

  @BuiltValueField(wireName: r'description')
  String? get description;

  @BuiltValueField(wireName: r'properties')
  OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties? get properties;

  OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo._();

  factory OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo([void updates(OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfoBuilder b)]) = _$OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfoBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo> get serializer => _$OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfoSerializer();
}

class _$OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfoSerializer implements PrimitiveSerializer<OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo, _$OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo];

  @override
  final String wireName = r'OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo object, {
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
        specifiedType: const FullType(OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfoBuilder result,
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
            specifiedType: const FullType.nullable(OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties),
          ) as OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties?;
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
  OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfoBuilder();
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


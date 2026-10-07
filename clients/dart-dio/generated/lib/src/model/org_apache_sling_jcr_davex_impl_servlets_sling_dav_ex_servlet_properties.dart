//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties.g.dart';

/// OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties
///
/// Properties:
/// * [alias] 
/// * [davPeriodCreateAbsoluteUri] 
/// * [davPeriodProtectedhandlers] 
@BuiltValue()
abstract class OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties implements Built<OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties, OrgApacheSlingJcrDavexImplServletsSlingDavExServletPropertiesBuilder> {
  @BuiltValueField(wireName: r'alias')
  ConfigNodePropertyString? get alias;

  @BuiltValueField(wireName: r'dav.create-absolute-uri')
  ConfigNodePropertyBoolean? get davPeriodCreateAbsoluteUri;

  @BuiltValueField(wireName: r'dav.protectedhandlers')
  ConfigNodePropertyString? get davPeriodProtectedhandlers;

  OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties._();

  factory OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties([void updates(OrgApacheSlingJcrDavexImplServletsSlingDavExServletPropertiesBuilder b)]) = _$OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingJcrDavexImplServletsSlingDavExServletPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties> get serializer => _$OrgApacheSlingJcrDavexImplServletsSlingDavExServletPropertiesSerializer();
}

class _$OrgApacheSlingJcrDavexImplServletsSlingDavExServletPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties, _$OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties];

  @override
  final String wireName = r'OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.alias != null) {
      yield r'alias';
      yield serializers.serialize(
        object.alias,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.davPeriodCreateAbsoluteUri != null) {
      yield r'dav.create-absolute-uri';
      yield serializers.serialize(
        object.davPeriodCreateAbsoluteUri,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.davPeriodProtectedhandlers != null) {
      yield r'dav.protectedhandlers';
      yield serializers.serialize(
        object.davPeriodProtectedhandlers,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingJcrDavexImplServletsSlingDavExServletPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'alias':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.alias.replace(valueDes);
          break;
        case r'dav.create-absolute-uri':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.davPeriodCreateAbsoluteUri.replace(valueDes);
          break;
        case r'dav.protectedhandlers':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.davPeriodProtectedhandlers.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingJcrDavexImplServletsSlingDavExServletPropertiesBuilder();
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


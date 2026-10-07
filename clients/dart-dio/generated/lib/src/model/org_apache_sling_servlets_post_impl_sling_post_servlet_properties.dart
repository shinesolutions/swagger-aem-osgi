//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_servlets_post_impl_sling_post_servlet_properties.g.dart';

/// OrgApacheSlingServletsPostImplSlingPostServletProperties
///
/// Properties:
/// * [servletPeriodPostPeriodDateFormats] 
/// * [servletPeriodPostPeriodNodeNameHints] 
/// * [servletPeriodPostPeriodNodeNameMaxLength] 
/// * [servletPeriodPostPeriodCheckinNewVersionableNodes] 
/// * [servletPeriodPostPeriodAutoCheckout] 
/// * [servletPeriodPostPeriodAutoCheckin] 
/// * [servletPeriodPostPeriodIgnorePattern] 
@BuiltValue()
abstract class OrgApacheSlingServletsPostImplSlingPostServletProperties implements Built<OrgApacheSlingServletsPostImplSlingPostServletProperties, OrgApacheSlingServletsPostImplSlingPostServletPropertiesBuilder> {
  @BuiltValueField(wireName: r'servlet.post.dateFormats')
  ConfigNodePropertyArray? get servletPeriodPostPeriodDateFormats;

  @BuiltValueField(wireName: r'servlet.post.nodeNameHints')
  ConfigNodePropertyArray? get servletPeriodPostPeriodNodeNameHints;

  @BuiltValueField(wireName: r'servlet.post.nodeNameMaxLength')
  ConfigNodePropertyInteger? get servletPeriodPostPeriodNodeNameMaxLength;

  @BuiltValueField(wireName: r'servlet.post.checkinNewVersionableNodes')
  ConfigNodePropertyBoolean? get servletPeriodPostPeriodCheckinNewVersionableNodes;

  @BuiltValueField(wireName: r'servlet.post.autoCheckout')
  ConfigNodePropertyBoolean? get servletPeriodPostPeriodAutoCheckout;

  @BuiltValueField(wireName: r'servlet.post.autoCheckin')
  ConfigNodePropertyBoolean? get servletPeriodPostPeriodAutoCheckin;

  @BuiltValueField(wireName: r'servlet.post.ignorePattern')
  ConfigNodePropertyString? get servletPeriodPostPeriodIgnorePattern;

  OrgApacheSlingServletsPostImplSlingPostServletProperties._();

  factory OrgApacheSlingServletsPostImplSlingPostServletProperties([void updates(OrgApacheSlingServletsPostImplSlingPostServletPropertiesBuilder b)]) = _$OrgApacheSlingServletsPostImplSlingPostServletProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingServletsPostImplSlingPostServletPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingServletsPostImplSlingPostServletProperties> get serializer => _$OrgApacheSlingServletsPostImplSlingPostServletPropertiesSerializer();
}

class _$OrgApacheSlingServletsPostImplSlingPostServletPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingServletsPostImplSlingPostServletProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingServletsPostImplSlingPostServletProperties, _$OrgApacheSlingServletsPostImplSlingPostServletProperties];

  @override
  final String wireName = r'OrgApacheSlingServletsPostImplSlingPostServletProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingServletsPostImplSlingPostServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.servletPeriodPostPeriodDateFormats != null) {
      yield r'servlet.post.dateFormats';
      yield serializers.serialize(
        object.servletPeriodPostPeriodDateFormats,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.servletPeriodPostPeriodNodeNameHints != null) {
      yield r'servlet.post.nodeNameHints';
      yield serializers.serialize(
        object.servletPeriodPostPeriodNodeNameHints,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.servletPeriodPostPeriodNodeNameMaxLength != null) {
      yield r'servlet.post.nodeNameMaxLength';
      yield serializers.serialize(
        object.servletPeriodPostPeriodNodeNameMaxLength,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.servletPeriodPostPeriodCheckinNewVersionableNodes != null) {
      yield r'servlet.post.checkinNewVersionableNodes';
      yield serializers.serialize(
        object.servletPeriodPostPeriodCheckinNewVersionableNodes,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.servletPeriodPostPeriodAutoCheckout != null) {
      yield r'servlet.post.autoCheckout';
      yield serializers.serialize(
        object.servletPeriodPostPeriodAutoCheckout,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.servletPeriodPostPeriodAutoCheckin != null) {
      yield r'servlet.post.autoCheckin';
      yield serializers.serialize(
        object.servletPeriodPostPeriodAutoCheckin,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.servletPeriodPostPeriodIgnorePattern != null) {
      yield r'servlet.post.ignorePattern';
      yield serializers.serialize(
        object.servletPeriodPostPeriodIgnorePattern,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingServletsPostImplSlingPostServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingServletsPostImplSlingPostServletPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'servlet.post.dateFormats':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.servletPeriodPostPeriodDateFormats.replace(valueDes);
          break;
        case r'servlet.post.nodeNameHints':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.servletPeriodPostPeriodNodeNameHints.replace(valueDes);
          break;
        case r'servlet.post.nodeNameMaxLength':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.servletPeriodPostPeriodNodeNameMaxLength.replace(valueDes);
          break;
        case r'servlet.post.checkinNewVersionableNodes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.servletPeriodPostPeriodCheckinNewVersionableNodes.replace(valueDes);
          break;
        case r'servlet.post.autoCheckout':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.servletPeriodPostPeriodAutoCheckout.replace(valueDes);
          break;
        case r'servlet.post.autoCheckin':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.servletPeriodPostPeriodAutoCheckin.replace(valueDes);
          break;
        case r'servlet.post.ignorePattern':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.servletPeriodPostPeriodIgnorePattern.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingServletsPostImplSlingPostServletProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingServletsPostImplSlingPostServletPropertiesBuilder();
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


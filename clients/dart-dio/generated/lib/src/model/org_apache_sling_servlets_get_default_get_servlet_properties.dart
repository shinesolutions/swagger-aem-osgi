//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_servlets_get_default_get_servlet_properties.g.dart';

/// OrgApacheSlingServletsGetDefaultGetServletProperties
///
/// Properties:
/// * [aliases] 
/// * [index] 
/// * [indexPeriodFiles] 
/// * [enablePeriodHtml] 
/// * [enablePeriodJson] 
/// * [enablePeriodTxt] 
/// * [enablePeriodXml] 
/// * [jsonPeriodMaximumresults] 
/// * [ecmaSuport] 
@BuiltValue()
abstract class OrgApacheSlingServletsGetDefaultGetServletProperties implements Built<OrgApacheSlingServletsGetDefaultGetServletProperties, OrgApacheSlingServletsGetDefaultGetServletPropertiesBuilder> {
  @BuiltValueField(wireName: r'aliases')
  ConfigNodePropertyArray? get aliases;

  @BuiltValueField(wireName: r'index')
  ConfigNodePropertyBoolean? get index;

  @BuiltValueField(wireName: r'index.files')
  ConfigNodePropertyArray? get indexPeriodFiles;

  @BuiltValueField(wireName: r'enable.html')
  ConfigNodePropertyBoolean? get enablePeriodHtml;

  @BuiltValueField(wireName: r'enable.json')
  ConfigNodePropertyBoolean? get enablePeriodJson;

  @BuiltValueField(wireName: r'enable.txt')
  ConfigNodePropertyBoolean? get enablePeriodTxt;

  @BuiltValueField(wireName: r'enable.xml')
  ConfigNodePropertyBoolean? get enablePeriodXml;

  @BuiltValueField(wireName: r'json.maximumresults')
  ConfigNodePropertyInteger? get jsonPeriodMaximumresults;

  @BuiltValueField(wireName: r'ecmaSuport')
  ConfigNodePropertyBoolean? get ecmaSuport;

  OrgApacheSlingServletsGetDefaultGetServletProperties._();

  factory OrgApacheSlingServletsGetDefaultGetServletProperties([void updates(OrgApacheSlingServletsGetDefaultGetServletPropertiesBuilder b)]) = _$OrgApacheSlingServletsGetDefaultGetServletProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingServletsGetDefaultGetServletPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingServletsGetDefaultGetServletProperties> get serializer => _$OrgApacheSlingServletsGetDefaultGetServletPropertiesSerializer();
}

class _$OrgApacheSlingServletsGetDefaultGetServletPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingServletsGetDefaultGetServletProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingServletsGetDefaultGetServletProperties, _$OrgApacheSlingServletsGetDefaultGetServletProperties];

  @override
  final String wireName = r'OrgApacheSlingServletsGetDefaultGetServletProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingServletsGetDefaultGetServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.aliases != null) {
      yield r'aliases';
      yield serializers.serialize(
        object.aliases,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.index != null) {
      yield r'index';
      yield serializers.serialize(
        object.index,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.indexPeriodFiles != null) {
      yield r'index.files';
      yield serializers.serialize(
        object.indexPeriodFiles,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.enablePeriodHtml != null) {
      yield r'enable.html';
      yield serializers.serialize(
        object.enablePeriodHtml,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.enablePeriodJson != null) {
      yield r'enable.json';
      yield serializers.serialize(
        object.enablePeriodJson,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.enablePeriodTxt != null) {
      yield r'enable.txt';
      yield serializers.serialize(
        object.enablePeriodTxt,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.enablePeriodXml != null) {
      yield r'enable.xml';
      yield serializers.serialize(
        object.enablePeriodXml,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.jsonPeriodMaximumresults != null) {
      yield r'json.maximumresults';
      yield serializers.serialize(
        object.jsonPeriodMaximumresults,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.ecmaSuport != null) {
      yield r'ecmaSuport';
      yield serializers.serialize(
        object.ecmaSuport,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingServletsGetDefaultGetServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingServletsGetDefaultGetServletPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'aliases':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.aliases.replace(valueDes);
          break;
        case r'index':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.index.replace(valueDes);
          break;
        case r'index.files':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.indexPeriodFiles.replace(valueDes);
          break;
        case r'enable.html':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.enablePeriodHtml.replace(valueDes);
          break;
        case r'enable.json':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.enablePeriodJson.replace(valueDes);
          break;
        case r'enable.txt':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.enablePeriodTxt.replace(valueDes);
          break;
        case r'enable.xml':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.enablePeriodXml.replace(valueDes);
          break;
        case r'json.maximumresults':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.jsonPeriodMaximumresults.replace(valueDes);
          break;
        case r'ecmaSuport':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.ecmaSuport.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingServletsGetDefaultGetServletProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingServletsGetDefaultGetServletPropertiesBuilder();
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


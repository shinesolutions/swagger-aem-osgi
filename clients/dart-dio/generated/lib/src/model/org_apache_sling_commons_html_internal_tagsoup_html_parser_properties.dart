//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_commons_html_internal_tagsoup_html_parser_properties.g.dart';

/// OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties
///
/// Properties:
/// * [parserPeriodFeatures] 
@BuiltValue()
abstract class OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties implements Built<OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties, OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserPropertiesBuilder> {
  @BuiltValueField(wireName: r'parser.features')
  ConfigNodePropertyArray? get parserPeriodFeatures;

  OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties._();

  factory OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties([void updates(OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserPropertiesBuilder b)]) = _$OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties> get serializer => _$OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserPropertiesSerializer();
}

class _$OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties, _$OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties];

  @override
  final String wireName = r'OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.parserPeriodFeatures != null) {
      yield r'parser.features';
      yield serializers.serialize(
        object.parserPeriodFeatures,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'parser.features':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.parserPeriodFeatures.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserPropertiesBuilder();
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


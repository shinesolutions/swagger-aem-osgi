//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_rewriter_processor_impl_html_parser_factory_properties.g.dart';

/// ComDayCqRewriterProcessorImplHtmlParserFactoryProperties
///
/// Properties:
/// * [htmlparserPeriodProcessTags] 
/// * [htmlparserPeriodPreserveCamelCase] 
@BuiltValue()
abstract class ComDayCqRewriterProcessorImplHtmlParserFactoryProperties implements Built<ComDayCqRewriterProcessorImplHtmlParserFactoryProperties, ComDayCqRewriterProcessorImplHtmlParserFactoryPropertiesBuilder> {
  @BuiltValueField(wireName: r'htmlparser.processTags')
  ConfigNodePropertyArray? get htmlparserPeriodProcessTags;

  @BuiltValueField(wireName: r'htmlparser.preserveCamelCase')
  ConfigNodePropertyBoolean? get htmlparserPeriodPreserveCamelCase;

  ComDayCqRewriterProcessorImplHtmlParserFactoryProperties._();

  factory ComDayCqRewriterProcessorImplHtmlParserFactoryProperties([void updates(ComDayCqRewriterProcessorImplHtmlParserFactoryPropertiesBuilder b)]) = _$ComDayCqRewriterProcessorImplHtmlParserFactoryProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqRewriterProcessorImplHtmlParserFactoryPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqRewriterProcessorImplHtmlParserFactoryProperties> get serializer => _$ComDayCqRewriterProcessorImplHtmlParserFactoryPropertiesSerializer();
}

class _$ComDayCqRewriterProcessorImplHtmlParserFactoryPropertiesSerializer implements PrimitiveSerializer<ComDayCqRewriterProcessorImplHtmlParserFactoryProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqRewriterProcessorImplHtmlParserFactoryProperties, _$ComDayCqRewriterProcessorImplHtmlParserFactoryProperties];

  @override
  final String wireName = r'ComDayCqRewriterProcessorImplHtmlParserFactoryProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqRewriterProcessorImplHtmlParserFactoryProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.htmlparserPeriodProcessTags != null) {
      yield r'htmlparser.processTags';
      yield serializers.serialize(
        object.htmlparserPeriodProcessTags,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.htmlparserPeriodPreserveCamelCase != null) {
      yield r'htmlparser.preserveCamelCase';
      yield serializers.serialize(
        object.htmlparserPeriodPreserveCamelCase,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqRewriterProcessorImplHtmlParserFactoryProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqRewriterProcessorImplHtmlParserFactoryPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'htmlparser.processTags':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.htmlparserPeriodProcessTags.replace(valueDes);
          break;
        case r'htmlparser.preserveCamelCase':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.htmlparserPeriodPreserveCamelCase.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqRewriterProcessorImplHtmlParserFactoryProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqRewriterProcessorImplHtmlParserFactoryPropertiesBuilder();
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


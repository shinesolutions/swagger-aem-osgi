//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_tagging_impl_search_tag_predicate_evaluator_properties.g.dart';

/// ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties
///
/// Properties:
/// * [ignorePath] 
@BuiltValue()
abstract class ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties implements Built<ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties, ComDayCqTaggingImplSearchTagPredicateEvaluatorPropertiesBuilder> {
  @BuiltValueField(wireName: r'ignore_path')
  ConfigNodePropertyBoolean? get ignorePath;

  ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties._();

  factory ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties([void updates(ComDayCqTaggingImplSearchTagPredicateEvaluatorPropertiesBuilder b)]) = _$ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqTaggingImplSearchTagPredicateEvaluatorPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties> get serializer => _$ComDayCqTaggingImplSearchTagPredicateEvaluatorPropertiesSerializer();
}

class _$ComDayCqTaggingImplSearchTagPredicateEvaluatorPropertiesSerializer implements PrimitiveSerializer<ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties, _$ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties];

  @override
  final String wireName = r'ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.ignorePath != null) {
      yield r'ignore_path';
      yield serializers.serialize(
        object.ignorePath,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqTaggingImplSearchTagPredicateEvaluatorPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'ignore_path':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.ignorePath.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqTaggingImplSearchTagPredicateEvaluatorPropertiesBuilder();
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


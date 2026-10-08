//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_search_suggest_impl_suggestion_index_manager_impl_properties.g.dart';

/// ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties
///
/// Properties:
/// * [pathBuilderPeriodTarget] 
/// * [suggestPeriodBasepath] 
@BuiltValue()
abstract class ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties implements Built<ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties, ComDayCqSearchSuggestImplSuggestionIndexManagerImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'pathBuilder.target')
  ConfigNodePropertyString? get pathBuilderPeriodTarget;

  @BuiltValueField(wireName: r'suggest.basepath')
  ConfigNodePropertyString? get suggestPeriodBasepath;

  ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties._();

  factory ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties([void updates(ComDayCqSearchSuggestImplSuggestionIndexManagerImplPropertiesBuilder b)]) = _$ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqSearchSuggestImplSuggestionIndexManagerImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties> get serializer => _$ComDayCqSearchSuggestImplSuggestionIndexManagerImplPropertiesSerializer();
}

class _$ComDayCqSearchSuggestImplSuggestionIndexManagerImplPropertiesSerializer implements PrimitiveSerializer<ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties, _$ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties];

  @override
  final String wireName = r'ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.pathBuilderPeriodTarget != null) {
      yield r'pathBuilder.target';
      yield serializers.serialize(
        object.pathBuilderPeriodTarget,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.suggestPeriodBasepath != null) {
      yield r'suggest.basepath';
      yield serializers.serialize(
        object.suggestPeriodBasepath,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqSearchSuggestImplSuggestionIndexManagerImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'pathBuilder.target':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.pathBuilderPeriodTarget.replace(valueDes);
          break;
        case r'suggest.basepath':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.suggestPeriodBasepath.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqSearchSuggestImplSuggestionIndexManagerImplPropertiesBuilder();
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


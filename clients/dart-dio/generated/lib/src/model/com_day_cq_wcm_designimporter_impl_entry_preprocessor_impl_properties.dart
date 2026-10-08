//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_wcm_designimporter_impl_entry_preprocessor_impl_properties.g.dart';

/// ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties
///
/// Properties:
/// * [searchPeriodPattern] 
/// * [replacePeriodPattern] 
@BuiltValue()
abstract class ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties implements Built<ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties, ComDayCqWcmDesignimporterImplEntryPreprocessorImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'search.pattern')
  ConfigNodePropertyString? get searchPeriodPattern;

  @BuiltValueField(wireName: r'replace.pattern')
  ConfigNodePropertyString? get replacePeriodPattern;

  ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties._();

  factory ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties([void updates(ComDayCqWcmDesignimporterImplEntryPreprocessorImplPropertiesBuilder b)]) = _$ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqWcmDesignimporterImplEntryPreprocessorImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties> get serializer => _$ComDayCqWcmDesignimporterImplEntryPreprocessorImplPropertiesSerializer();
}

class _$ComDayCqWcmDesignimporterImplEntryPreprocessorImplPropertiesSerializer implements PrimitiveSerializer<ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties, _$ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties];

  @override
  final String wireName = r'ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.searchPeriodPattern != null) {
      yield r'search.pattern';
      yield serializers.serialize(
        object.searchPeriodPattern,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.replacePeriodPattern != null) {
      yield r'replace.pattern';
      yield serializers.serialize(
        object.replacePeriodPattern,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqWcmDesignimporterImplEntryPreprocessorImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'search.pattern':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.searchPeriodPattern.replace(valueDes);
          break;
        case r'replace.pattern':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.replacePeriodPattern.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqWcmDesignimporterImplEntryPreprocessorImplPropertiesBuilder();
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


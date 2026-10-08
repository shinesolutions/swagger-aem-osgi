//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_wcm_designimporter_design_package_importer_properties.g.dart';

/// ComDayCqWcmDesignimporterDesignPackageImporterProperties
///
/// Properties:
/// * [extractPeriodFilter] 
@BuiltValue()
abstract class ComDayCqWcmDesignimporterDesignPackageImporterProperties implements Built<ComDayCqWcmDesignimporterDesignPackageImporterProperties, ComDayCqWcmDesignimporterDesignPackageImporterPropertiesBuilder> {
  @BuiltValueField(wireName: r'extract.filter')
  ConfigNodePropertyArray? get extractPeriodFilter;

  ComDayCqWcmDesignimporterDesignPackageImporterProperties._();

  factory ComDayCqWcmDesignimporterDesignPackageImporterProperties([void updates(ComDayCqWcmDesignimporterDesignPackageImporterPropertiesBuilder b)]) = _$ComDayCqWcmDesignimporterDesignPackageImporterProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqWcmDesignimporterDesignPackageImporterPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqWcmDesignimporterDesignPackageImporterProperties> get serializer => _$ComDayCqWcmDesignimporterDesignPackageImporterPropertiesSerializer();
}

class _$ComDayCqWcmDesignimporterDesignPackageImporterPropertiesSerializer implements PrimitiveSerializer<ComDayCqWcmDesignimporterDesignPackageImporterProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqWcmDesignimporterDesignPackageImporterProperties, _$ComDayCqWcmDesignimporterDesignPackageImporterProperties];

  @override
  final String wireName = r'ComDayCqWcmDesignimporterDesignPackageImporterProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqWcmDesignimporterDesignPackageImporterProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.extractPeriodFilter != null) {
      yield r'extract.filter';
      yield serializers.serialize(
        object.extractPeriodFilter,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqWcmDesignimporterDesignPackageImporterProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqWcmDesignimporterDesignPackageImporterPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'extract.filter':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.extractPeriodFilter.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqWcmDesignimporterDesignPackageImporterProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqWcmDesignimporterDesignPackageImporterPropertiesBuilder();
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


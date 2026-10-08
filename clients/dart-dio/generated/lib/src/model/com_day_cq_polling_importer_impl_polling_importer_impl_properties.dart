//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_polling_importer_impl_polling_importer_impl_properties.g.dart';

/// ComDayCqPollingImporterImplPollingImporterImplProperties
///
/// Properties:
/// * [importerPeriodMinPeriodInterval] 
/// * [importerPeriodUser] 
/// * [excludePeriodPaths] 
/// * [includePeriodPaths] 
@BuiltValue()
abstract class ComDayCqPollingImporterImplPollingImporterImplProperties implements Built<ComDayCqPollingImporterImplPollingImporterImplProperties, ComDayCqPollingImporterImplPollingImporterImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'importer.min.interval')
  ConfigNodePropertyInteger? get importerPeriodMinPeriodInterval;

  @BuiltValueField(wireName: r'importer.user')
  ConfigNodePropertyString? get importerPeriodUser;

  @BuiltValueField(wireName: r'exclude.paths')
  ConfigNodePropertyArray? get excludePeriodPaths;

  @BuiltValueField(wireName: r'include.paths')
  ConfigNodePropertyArray? get includePeriodPaths;

  ComDayCqPollingImporterImplPollingImporterImplProperties._();

  factory ComDayCqPollingImporterImplPollingImporterImplProperties([void updates(ComDayCqPollingImporterImplPollingImporterImplPropertiesBuilder b)]) = _$ComDayCqPollingImporterImplPollingImporterImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqPollingImporterImplPollingImporterImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqPollingImporterImplPollingImporterImplProperties> get serializer => _$ComDayCqPollingImporterImplPollingImporterImplPropertiesSerializer();
}

class _$ComDayCqPollingImporterImplPollingImporterImplPropertiesSerializer implements PrimitiveSerializer<ComDayCqPollingImporterImplPollingImporterImplProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqPollingImporterImplPollingImporterImplProperties, _$ComDayCqPollingImporterImplPollingImporterImplProperties];

  @override
  final String wireName = r'ComDayCqPollingImporterImplPollingImporterImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqPollingImporterImplPollingImporterImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.importerPeriodMinPeriodInterval != null) {
      yield r'importer.min.interval';
      yield serializers.serialize(
        object.importerPeriodMinPeriodInterval,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.importerPeriodUser != null) {
      yield r'importer.user';
      yield serializers.serialize(
        object.importerPeriodUser,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.excludePeriodPaths != null) {
      yield r'exclude.paths';
      yield serializers.serialize(
        object.excludePeriodPaths,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.includePeriodPaths != null) {
      yield r'include.paths';
      yield serializers.serialize(
        object.includePeriodPaths,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqPollingImporterImplPollingImporterImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqPollingImporterImplPollingImporterImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'importer.min.interval':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.importerPeriodMinPeriodInterval.replace(valueDes);
          break;
        case r'importer.user':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.importerPeriodUser.replace(valueDes);
          break;
        case r'exclude.paths':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.excludePeriodPaths.replace(valueDes);
          break;
        case r'include.paths':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.includePeriodPaths.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqPollingImporterImplPollingImporterImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqPollingImporterImplPollingImporterImplPropertiesBuilder();
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


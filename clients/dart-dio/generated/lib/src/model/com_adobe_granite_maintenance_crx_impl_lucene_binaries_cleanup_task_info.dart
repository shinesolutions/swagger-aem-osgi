//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/com_adobe_granite_maintenance_crx_impl_lucene_binaries_cleanup_task_properties.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_maintenance_crx_impl_lucene_binaries_cleanup_task_info.g.dart';

/// ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfo
///
/// Properties:
/// * [pid] 
/// * [title] 
/// * [description] 
/// * [properties] 
/// * [bundleLocation] 
/// * [serviceLocation] 
@BuiltValue()
abstract class ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfo implements Built<ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfo, ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfoBuilder> {
  @BuiltValueField(wireName: r'pid')
  String? get pid;

  @BuiltValueField(wireName: r'title')
  String? get title;

  @BuiltValueField(wireName: r'description')
  String? get description;

  @BuiltValueField(wireName: r'properties')
  ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties? get properties;

  @BuiltValueField(wireName: r'bundle_location')
  String? get bundleLocation;

  @BuiltValueField(wireName: r'service_location')
  String? get serviceLocation;

  ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfo._();

  factory ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfo([void updates(ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfoBuilder b)]) = _$ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfo;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfoBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfo> get serializer => _$ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfoSerializer();
}

class _$ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfoSerializer implements PrimitiveSerializer<ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfo> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfo, _$ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfo];

  @override
  final String wireName = r'ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfo';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfo object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.pid != null) {
      yield r'pid';
      yield serializers.serialize(
        object.pid,
        specifiedType: const FullType(String),
      );
    }
    if (object.title != null) {
      yield r'title';
      yield serializers.serialize(
        object.title,
        specifiedType: const FullType(String),
      );
    }
    if (object.description != null) {
      yield r'description';
      yield serializers.serialize(
        object.description,
        specifiedType: const FullType(String),
      );
    }
    if (object.properties != null) {
      yield r'properties';
      yield serializers.serialize(
        object.properties,
        specifiedType: const FullType(ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties),
      );
    }
    if (object.bundleLocation != null) {
      yield r'bundle_location';
      yield serializers.serialize(
        object.bundleLocation,
        specifiedType: const FullType(String),
      );
    }
    if (object.serviceLocation != null) {
      yield r'service_location';
      yield serializers.serialize(
        object.serviceLocation,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfo object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfoBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'pid':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.pid = valueDes;
          break;
        case r'title':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.title = valueDes;
          break;
        case r'description':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.description = valueDes;
          break;
        case r'properties':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties),
          ) as ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties?;
          if (valueDes == null) continue;
          result.properties.replace(valueDes);
          break;
        case r'bundle_location':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.bundleLocation = valueDes;
          break;
        case r'service_location':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.serviceLocation = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfo deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfoBuilder();
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

